# Арифметические действия с дробями

Лабораторные работы 1 и 2 по Инструментальным средствам разработки программного обеспечения

## Функционал

Работа производится с простыми дробями.
Программа умеет:

- хранить набор дробей
- подсчитывать сумму двух простых дробей
- находить минимум и максимум в наборе дробей

## Новые фичи

Добавлены в версии 2.0:

### Файловый ввод

Вводит информацию из файла input.io в переданный в качестве аргумента набор дробей. Вводятся только целые числа и дроби в формате 3/4 или -3/4.

```
FractionSet fset2 = new FractionSet();
FileInput input = new FileInput();
input.inp(fset2);
```

### Файловый вывод

Выводит минимум и максимум набора дробей в файл output.io.

```
FileOutput output = new FileOutput();
output.outp(fset2);
```

## Запланированы к выходу

- консольный интерфейс
- подсчёт суммы всех дробей в наборе
- вывод всего набора
