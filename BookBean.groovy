// Demonstration of GroovyBean

class Book {
    String title
}

Book gina = new Book()
gina.setTitle('Groovy in Action')
assert gina.getTitle() == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'

String getTitleBackwards(book) {
    String title = book.getTitle()
    return title.reverse()
}

