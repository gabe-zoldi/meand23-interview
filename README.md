# 23andMe Interview

Write a function that takes a string and returns a "compressed" version
of that string where repeated characters are represented by the character
followed by the number of times it was repeated.

Examples:
compress('abc') -> 'abc'
compress('aabbcc') -> 'a2b2c2'
compress('abbbcc') -> 'ab3c2'
compress('abcabc') -> 'abcabc'
compress('bbbaaabbbaaa') -> 'b3a3b3a3'

How should we test this?

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
 
 
## Coding Exercise (RestAssured)

test location: com.acme.qa.site.bluntusa.test.functional.cart.AddSingleItem

structure:
	src/test/java
		com/acme/qa
				common
				site/bluntusa
					dao
					model
						data
### Setup

1. Download/install JDK 8: http://www.oracle.com/technetwork/java/javase/downloads/index.html 
2. Download/install IntelliJ: https://www.jetbrains.com/idea/download
3. [Window Only] Download/install Git: https://git-scm.com/download

### Git

1. Open Terminal (mac) or Git Bash (windows) window.
2. mkdir github
3. cd github
4. git clone git@github.com:gabezoldi/netflix.git
5. cd netflix
6. run: mvn -Dtest=AddSingleItem clean test
