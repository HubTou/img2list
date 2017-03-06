
img2list: img2list.class

img2list.class: img2list.java
	@javac img2list.java

clean:
	@rm -f img2list.class
