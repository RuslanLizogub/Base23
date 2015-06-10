package week6.homework6;
/* Написать метод быстрой сортировки для массива студентов по оценкам, от отличников к двоечникам.
void sort(Student[] students)

Студент (имя, фамилия, отчество, оценки по викендам).
Оценки по викендам представляют собой массив целых чисел.

Классы задания: hw8.sort.QuickSorter, hw8.sort.Student
*/
class Student {
	int rating;
	
	public Student(int rating){
		this.rating = rating;
	}
	
	public void setRating(int rating){
		this.rating = rating;
	}
}
