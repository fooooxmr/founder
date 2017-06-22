# founder
---
Приложение, которое осуществляет поиск столбцов в CSV файле и выводит их в другой файл.
### Входные параметры
*`i`* - входной файл.(Должен быть формата `CSV`).<br>
*`q`* - строка для поиска.(Может быть регулярным выражением). <br>
*`o`* - выходной файл.(Может быть формата `CSV` или `txt`). <br>
Регистр учитывается.<br>
При выводе в `CVS` файл найденные столбцы превращаются в строки.<br>
При выводе в `txt` файл найденые столбцы объединяются в один большой столбец.<br>
#### Пример входного файла
```cmd
one,two,three,four,five,six
twenty,files,mom,dad,son,sister
dog,cat,car,boy,seven,lider
green,goal,exposit,car,bus,nissan
nitro,comit,release,bug,greed,lumber
```
#### Пример выходного файла `CSV`
```cmd
three,mom,car,exposit,release
four4,dad,boy,car,bug
```
#### Пример выходного файла `txt`
```cmd
three
mom
car
exposit
release
four4
dad
boy
car
bug
```
### Выполнение
Для запуска приложения необходимо запустить `founder-0.0.1-SNAPSHOT-jar-with-dependencies.jar` 
из папки `target` в командной строке, передав туда необходимые параметры.
#### Примеры:
```cmd
java -jar founder-0.0.1-SNAPSHOT-jar-with-dependencies.jar -i input.csv -q cat -o output.csv
java -jar founder-0.0.1-SNAPSHOT-jar-with-dependencies.jar -i input.csv -q c.t -o output.txt
```
