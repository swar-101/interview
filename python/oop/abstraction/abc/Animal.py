from abc import ABC, abstractmethod


# Abstract Base Class
class Animal(ABC):
    @abstractmethod
    def sound(self):  # abstract method
        pass

    def sleep(self):  # concrete method
        return "Zzz"


# Concrete Subclasses
class Dog(Animal):
    def sound(self):
        return "Woof"


class Cat(Animal):
    def sound(self):
        return "Meow"


snowbell = Cat()
print(snowbell.sound())
print(snowbell.sleep())

pilchard = Dog()
print(pilchard.sound())
print(pilchard.sleep())