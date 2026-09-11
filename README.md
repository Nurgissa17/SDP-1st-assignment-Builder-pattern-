# SDP-1st-assignment-Builder-pattern-
1st assignment for Software design patterns
Builder pattern used to create a simple emailing system

The program creates two representations of the same email:
1) ordinary email object
2) text representation

Classes:
Main - Client
Email - product
EmailBuilder - Builder
EmailObjectBuilder - Concrete builder 1
EmailTextBuilder - Concrete builder 2
EmailDirector - Director

The Director contains two representations:
1)Welcome email
2)Reminder email
