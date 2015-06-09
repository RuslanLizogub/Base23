package week6.homework6;

import java.util.ArrayList;

/* Написать метод быстрой сортировки для массива студентов по оценкам, от отличников к двоечникам.
 void sort(Student[] students)

 Студент (имя, фамилия, отчество, оценки по викендам).
 Оценки по викендам представляют собой массив целых чисел.

 Классы задания: hw8.sort.QuickSorter, hw8.sort.Student
 */
public class QuickSorter {
	public static int ARRAY_LENGTH = 10;
	private static Student[] students = new Student[ARRAY_LENGTH];

	public static void main(String[] args) {
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student((int) (Math.random() * 5));
		}

		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].rating + " ");
		}

		sort(students);
		System.out.println();

		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].rating + " ");
		}
	}

	public static void sort(Student[] students) {
		int startIndex = 0;
		int endIndex = ARRAY_LENGTH - 1;
		doSort(startIndex, endIndex, students);

		Student[] buferArray = new Student[students.length];
		for (int i = 0; i < buferArray.length; i++) {
			buferArray[i] = students[i];
		}

		for (int i = 0; i < students.length; i++) {
			students[i] = buferArray[students.length - (i + 1)];
		}

	}

	private static void doSort(int start, int end, Student[] students) {
		if (start >= end)
			return;
		int i = start, j = end;
		int cur = i - (i - j) / 2;
		while (i < j) {
			while (i < cur && (students[i].rating <= students[cur].rating)) {
				i++;
			}
			while (j > cur && (students[cur].rating <= students[j].rating)) {
				j--;
			}
			if (i < j) {
				int temp = students[i].rating;
				students[i].setRating(students[j].rating);
				students[j].rating = temp;
				if (i == cur)
					cur = j;
				else if (j == cur)
					cur = i;
			}
		}
		doSort(start, cur, students);
		doSort(cur + 1, end, students);
	}
}
