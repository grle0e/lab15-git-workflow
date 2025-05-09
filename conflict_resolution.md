# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй
`develop`-ийг `feature/improved-multiplication` руу нэгтгэхэд `src/main/java/lab15/sict/must/edu/mn/Multiplication.java` дээр merge conflict гарсан. Conflict нь `multiply` функцийн Javadoc коммент дээр байсан.

## Шийдвэрлэлтийн Алхмууд
1. `git checkout feature/improved-multiplication` командыг ажиллуулж, салбар руу шилжсэн
2. Файлыг нээж, conflict-ийг шийдвэрлэнэ
3. Нэгтгэлийг дуусгана:
git add src/main/java/lab15/sict/must/edu/mn/Multiplication.java
git commit -m "develop-ийг feature/improved-multiplication руу нэгтгэж, conflict-ийг шийдвэрлэсэн"
