"""
Multiple Inheritance
"""


class Animal:
    def speak(self):
        return "leer cutely"


class Pet:
    def play(self):
        return "Yay! Me & my pet play!"


class Dog(Animal, Pet):
    def speak(self):
        return "Woof"

tommy = Dog()
print(tommy.speak())
print(tommy.play())