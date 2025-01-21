"""
Encapsulation is about bundling of data/fields/attributes and operations/functions/methods which operate on this data
into a single unit, typically a class.
"""


class BankAccount:

    def __init__(self):
        self.__balance = 0  # Private attribute

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount

    def get_balance(self):
        return self.__balance