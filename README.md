# Iamstuck Transpiler

Source code transpiler from Iamstuck to C++ made with ANTL4.

## Authors
- [Jan Augustyn](https://github.com/jaugustyn02)
- [Jakub Kroczek](https://github.com/jkr02)

## System requirements
   - Python 3.8.5
   - antlr4-python3-runtime==4.13.1
   - antlr4-tools == 0.2.1

## Installation

To install any required packages, run this code:

    pip install -r requirements.txt

## How to run

To transpile code to C++, compile it and run it, run this code:

    make f="<path_to_file>"

To only transpile code to C++:

    make transpile f="<path_to_file>"

To only compile code:

    make compile_cpp f="<path_to_file>"

## Documentation

See [documentation](/Iamstuck-documentation.md).