sort_test: sort_test.o bubble_sort.o selection_sort.o heap_sort.o
    gcc -o sort_test sort_test.o bubble_sort.o selection_sort.o heap_sort.o

sort_test.o: sort_test.c
    gcc -c sort_test.c

bubble_sort.o: bubble_sort.c
    gcc -c bubble_sort.c

selection_sort.o: selection_sort.c
    gcc -c selection_sort.c

heap_sort.o: heap_sort.c
    gcc -c heap_sort.c

clean: 
    rm sort_test sort_test.o bubble_sort.o selection_sort.o heap_sort.o
