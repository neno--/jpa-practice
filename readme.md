Tests various kinds of entity relationships in JPA

link to h2: http://localhost:8080/h2-console/

one-to-one


one-to-many

case1: unidirectional - parent to child
creates join table parent1_children

case2: bidirectional - default values
these are two unidirectional relationships.
creates join table parent2_children
child2 table gets extra foreign key to parent.

case3: bidirectional with relationship aware metadata
mapped by is field name of child entity

