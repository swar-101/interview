# Method overloading is NOT supported in Python.

class JungleRestaurant:

    def order_food(self, animal, food1, food2):
        return f"{animal} ordered {food1} and {food2}"


    def order_food(self, animal, food1, food2, food3):
        return f"{animal} ordered {food1}, {food2} and {food3}"



jungle_diner = JungleRestaurant()

bears_order = jungle_diner.order_food('Bear', 'Honey', 'Honey Bees', 'Bananas')
print(bears_order)

monkeys_order = jungle_diner.order_food('Monkey', 'Nuts', 'Bananas')
print(monkeys_order) # Monkey's order is not fulfilled as Python enforces to keep only the last method definition

