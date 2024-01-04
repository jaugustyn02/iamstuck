.PHONY: all clean

all: transpile compile_cpp

compile_cpp: containers/main.cpp
	g++ -o main.exe containers/main.cpp
	./main.exe

transpile:
	python run.py $(f)

clean:
	rm -f main.exe containers/main.cpp
