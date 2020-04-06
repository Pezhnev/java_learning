package ru.stqa.learn.sandbox;

public class Square {  //новый класс, структура объектов с информацией о квадрат
  public double l; //атрибут

  public Square(double l) { //псевдо функция-конструктор, без типа значения
    this.l=l; // значения
  }
  public double area () {  //функция area с параметром объекта типо квадрат
    return this.l * this.l; //доступ к атрибуту
  }
}
