class A:
    def say(self):
        return "Aye"


class B(A):
    def say(self):
        return "Be yourself"


class C(A):
    def say(self):
        return "See you again!"


# Classes B & C both inherit class A

# Class D inherits class B & C

class D(B, C):
    pass


# Let's see what D calls

dee = D()
print(dee.say())
