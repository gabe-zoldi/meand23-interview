# Netflix Interview

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
