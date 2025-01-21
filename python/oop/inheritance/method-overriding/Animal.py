class Animal:
    def speak(self):
        return "Leers quietly"


class Dog(Animal):
    def speak(self):
        return "Woof"


class Cow(Animal):
    def speak(self):
        return "Mooo"


class Monkey(Animal):
    def speak(self):
        parent_speech = super().speak()
        return f"{parent_speech} and Oo oo, aah aah"


norm = Animal()
smith = Dog()
salma = Cow()
richard = Monkey()

print(norm.speak())
print(smith.speak()) # Inherits Animal class and overrides the speak() method
print(salma.speak()) # Inherits Animal class and overrides the speak() method, as well.
print(richard.speak()) # Calls the parent method using super() function and returns its
