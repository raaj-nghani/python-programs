import random

def get_random_city(filepath):
    try:
        with open(filepath, 'r', encoding='utf-8') as file: 
            cities = [line.strip() for line in file if line.strip()] 
            if cities: 
                return random.choice(cities)
            else:
                print("File is empty.")
                return None
    except FileNotFoundError:
        print(f"File not found: {filepath}")
        return None
    except Exception as e: 
        print(f"An error occurred: {e}")
        return None

if __name__ == "__main__":
    filepath = "d://data//city.txt"  
    random_city = get_random_city(filepath)

    if random_city:
        print(f"A random city is: {random_city}")
