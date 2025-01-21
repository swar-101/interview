from abc import ABC, abstractmethod
from cmath import pi


class Shape(ABC):
    @abstractmethod
    def area(self):
        pass


class Rectangulo(Shape):
    def __init__(self, longitud, ancho):
        self.longitud = longitud
        self.ancho = ancho

    def area(self):
        return self.longitud * self.ancho

    def perimeter(self):
        return 2 * (self.longitud + self.ancho)

class Circulo(Shape):

    def __init__(self, radio):
        self.radius = radio

    def area(self):
        return pi * self.radius ^ 2

    def circumference(self):
        return 2 * pi * self.radius


raquel = Rectangulo(5, 2)
print(raquel.area())
print(raquel.perimeter())

selina = Circulo(32)
print(selina.area())
print(selina.circumference())