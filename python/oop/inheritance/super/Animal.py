class Animal:
    def speak(self):
        return "cute looks"


class Dog(Animal):
    def speak(self):
        return "Rawf"

    def call_parent(self):
        return super().speak()


class Capybara(Animal):
    def speak(self):
        return super().speak()


class Goldfish(Animal):
    def speak(self):
        return super().speak() + " and bubbles"


elijah = Dog()
print(elijah.speak()) # Calls the overridden method speak()
print(elijah.call_parent()) # Calls the default method speak()

stewie = Capybara()
print(stewie.speak()) # Calls the default method speak()

polly = Goldfish()
print(polly.speak())   # Customizes the default method speak()