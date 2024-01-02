.PHONY: all clean

all: transpile compile_cpp

compile_cpp: containers/main.cpp
	g++ -o out containers/main.cpp
	./out

transpile:
	python run.py $(filename)

clean:
	rm -f out containers/main.cpp
