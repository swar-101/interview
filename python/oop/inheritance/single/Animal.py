
"""Single Inheritance"""

class Animal:
       def speak(self):
           return "leer cutely"


class Dog(Animal):
    def speak(self):
        return "Bow Wow"


class JellyFish(Animal):
    pass


my_dog = Dog()
print(my_dog.speak())


that_jellyfish = JellyFish()
print(that_jellyfish.speak())