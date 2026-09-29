# Project Start: May 3, 2026; Project End: Month Day, YYYY

"""
Website of recordings from 1927 with coding.
    I felt like making a site of recordings made in one year. I chose 1927, since I was just started to get into 1920s jazz drumming. 
    I started in May 2026. 
    Wanted to use my (okay) knowledge of UI (user interface), UX (user experience) and front-end development from my sophomore college water-monitoring research class.
    I want to get better at coding (without relying on AI when needed which so far has been going well). 
    Started coding two years ago, but it felt lots of fun to try and learn (mainly Python). 
    Quiet person, but when I am not busy with computer science (and whenever I can), I read a lot and play drums.
"""

# I will do the coding first (with the csv import) and the CSS/web building (HyperText MarkupLanguage) afterwards
# I am not sure of what to with the unknown [00-00-1927] and/or dates like these [month-00-1927]

# what I have so far
import csv

def load_csv(filepath):
    with open(filepath, newline='', encoding='utf-8') as csvfile:
        return list(csv.DictReader(csvfile))

df = load_csv("1927_Recordings.csv") # CSV file being loaded, need to fix FileNotFoundError: [Errno 2] No such file or directory: '1927_Recordings.csv'

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
    
    return missing

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

            case "2":
                company = input("Enter the name of the recording company:")
                results = search_by_company(company)

            case "3":
                title = input("Enter a title:")
                results = search_by_title(title)

            case "4":
                artist = input("Enter the name(s) of the artist(s):")
                results = search_by_artist(artist)

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

            case "8": # how many times a recording company name shows up
                company = input("Enter the recording company name: ")
                count = count_company(company)
                print(f"\nThe company '{company}' appears {count} time(s).")
                continue
        
            case "9": # how many times a title shows up
                title = input("Enter the title: ")
                count = count_title(title)
                print(f"\nThe title '{title}' appears {count} time(s).")
                continue

            case "10": # how many times an artist name shows up
                            artist = input("Enter the artist: ")
                            count = count_artist(artist)
                            print(f"\nThe artist '{artist}' appears {count} time(s).")
                            continue
        
            case "11": # exit program
                print("\nGoodbye")
                break

            case _:
                print("Your choice is invalid")
                continue

    # printing results only for options 1 to 4
    print("\nResults:")
    if not results:
        print("No recordings found")
    else:
        for row in results:
            print(row)

# end of file
if __name__ == "__main__":
    main()