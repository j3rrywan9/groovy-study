// Demonstration of GroovyBean

class Book {
	// Property declaration
    String title
}

Book gina = new Book()

// Property use with explicit accessor methods
gina.setTitle('Groovy in Action')
assert gina.getTitle() == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'

// Property use with Groovy shortcuts
gina.title = 'Groovy conquers the world!'
assert gina.title == 'Groovy conquers the world!'

String getTitleBackwards(book) {
    String title = book.getTitle()
    return title.reverse()
}

