# Project Started: May 3, 2026
# Project End: Month Day, YYYY

"""
Website of recordings from 1927 with coding and some CSS/HTML stuff.
    I wanted to get better at coding. I started coding two years ago, but it felt lots of fun to try and learn (mainly Python).
        Quiet person, but when I am not busy with computer science (and whenever I can), I read a lot and play drums.
    
    I used my knowledge of UI (user interface) & front-end development from my sophomore college water-monitoring research class for it.
    I also rarely use AI except when needed.

    I will do the coding first (with the csv import) and the CSS/web building (HyperText MarkupLanguage) afterwards
    I am not sure of what to with the unknown [00-00-1927] and/or dates like these [month-00-1927]
    I got bored around May of 2026.
    I decided to code/make a site of recordings from 1927 for fun (introvert with lack of social life and does classwork a lot (I should get out more).

        Anyway, whenever I'm not doing classwork (or contemplating if I chose CS as the wrong major), I read books (and play drums) in my spare time and for this project, I also drummed to some those recordings from that year.
        In my drumming analysis of 1920s drumming for dance-bands, here's what I found:
        
        In 1920s dance-band drumming, most drummers used the snare drum and cymbal to keep time. 
        The bass drum was in 2/4, press rolls with drumsticks and brushwork (both on the snare) created a light 4/4 feel
        The cymbal, woodblock, and tom-tom were used as rhythmic fills and/or patterns whenever a drummer felt like using them at the right time. 
        When reading 1920s drum charts, the notation is relatively simple; the charts were not meant to be played exactly as written, but rather served as roadmaps to show where rhythms and structural breaks occured. 
        Overall, if you can keep a steady time feel, practice, read music, and add your own style (when needed), it can go a long way. 
"""

# what I have so far
import csv # csv import
from pathlib import Path # use script directory to fix CSV

def load_csv(filepath):
    with open(filepath, newline='', encoding='utf-8') as csvfile:
        return list(csv.DictReader(csvfile))

csv_path = Path(__file__).parent /"1927_Recordings.csv" # CSV file being loaded
df = load_csv(csv_path)

# searching function [dates, companies, titles & artists]
def search(field, value):
    return[row for row in df if value.lower() in row[field].lower()]

def search_by_date(date): 
    return search("date", date)

def search_by_company(company):
    return search("company", company)

def search_by_title(title):
    return search("title", title)

def search_by_artist(artist):
    return search("artist", artist)

# counting functions [dates, missing dates, companies, titles]
def count_date(date):
    return len(search_by_date(date))

def find_missing_dates():
    """Returning rows where the date is 00-00-yyyy or mm-00-yyyy"""
    missing = []
    for row in df:
        date = row["date"].strip()

        if not date or len(date) != 10 or "-" not in date: # Empty or malformed dates
            continue

        month, day, year = date.split("-")

        # Case 1: completely unknown dates [00-00-yyyy]
        if month == "00" and day == "00":
            missing.append(row)
            continue

        # Case 2: known month, unknown day [mm-00-yyyy]
        if month != "00" and day == "00":
            missing.append(row)
    
    return missing # this will return all the missing dates

def count_missing_date_types():
    """Return (completely_unknown, unknown_day)."""
    completely_unknown = 0   # 00-00-YYYY
    unknown_day = 0          # MM-00-YYYY

    for row in df:
        date = row["date"].strip()

        if not date or len(date) != 10 or "-" not in date:
            continue

        month, day, year = date.split("-")

        if month == "00" and day == "00":
            completely_unknown += 1
        elif month != "00" and day == "00":
            unknown_day += 1

    return completely_unknown, unknown_day

def count_company(company):
    return len(search_by_company(company))

def count_title(title):
    return len(search_by_title(title))

def count_artist(artist):
    return len(search_by_artist(artist))

# main program here
def main():
    while True:
        print("1927 Recording Search Tool")
        print("1. Search by date [mm-dd-yyyy]")
        print("2. Search for a recording company")
        print("3. Search by title")
        print("4. Search by artist(s)")
        print("5. Count recordings on a specific date")
        print("6. Show recordings with no date")
        print("7. Count missing date types") 
        print("8. Count of record company appearances")
        print("9. Count of title appearances")
        print("10. Count of artist(s) appearances")
        print("11. Exit")
    
        choice = input("Choose whichever option works best").strip() # choice with if-else statements for choosing options
        results = []

        match choice:
            case "1":
                date = input("Enter a date [mm-dd-yyyy]:")
                results = search_by_date(date)
                print("\nResults:")
                if not results:
                    print("No recordings found")
                else:
                    for row in results:
                        print(row)

            case "2":
                company = input("Enter the name of the recording company:")
                results = search_by_company(company)
                print("\nResults:")
                if not results:
                    print("No recordings found")
                else:
                    for row in results:
                        print(row)
                
            case "3":
                title = input("Enter a title:")
                results = search_by_title(title)
                print("\nResults:")
                if not results:
                    print("No recordings found")
                else:
                    for row in results:
                        print(row)
        
            case "4":
                artist = input("Enter the name(s) of the artist(s):")
                results = search_by_artist(artist)
                print("\nResults:")
                if not results:
                    print("No recordings found")
                else:
                    for row in results:
                        print(row)
                
            case "5": # how much was recorded on a specific date
                date = input("Enter a date [mm-dd-yyyy]: ")
                count = count_date(date)
                print(f"\nThere were '{count}' recording(s) on {date}.")

            case "6":
                missing = find_missing_dates()
                print("\nRecordings with no date:")
                for row in missing:
                    print(row)

            case "7":
                completely_unknown, unknown_day = count_missing_date_types()
                print(f"\nCompletely unknown dates [00-00-yyyy]: {completely_unknown}")
                print(f"Known month, unknown day [mm-00-yyyy]: {unknown_day}")
                continue

            case "8": # amount of times a recording company name shows up
                company = input("Enter the recording company name: ")
                count = count_company(company)
                print(f"\nThe company '{company}' appears {count} time(s).")
                continue
        
            case "9": # amount of times a title shows up
                title = input("Enter the title: ")
                count = count_title(title)
                print(f"\nThe title '{title}' appears {count} time(s).")
                continue

            case "10": # amount of times an artist name shows up
                            artist = input("Enter the artist: ")
                            count = count_artist(artist)
                            print(f"\nThe artist '{artist}' appears {count} time(s).")
                            continue
        
            case "11": # exits the program
                print("\nGoodbye")
                break

            case _:
                print("Your choice is invalid")
                continue

# end of file
if __name__ == "__main__":
    main()