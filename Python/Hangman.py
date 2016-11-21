from random import randint

heroes = ["batman", "flash", "superman", 
        "cyborg", "wonderwoman" ,"aquaman",
        "ironman", "hulk", "thor",
        "wolverine", "spiderman"]

length = len(heroes)
rand = randint(0, length)
word = heroes[rand]
