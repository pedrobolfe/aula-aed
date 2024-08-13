git:
	@git config --global user.email pedroschroeder06@gmail.com
	@git config --global user.name "Pedro Schroeder"
build:
	@javac -d bin/ Main.java
	@javac -d bin/ aulas/Aula20.java
run:
	@java -cp bin/ Main
clear: 
	rm -r bin/*