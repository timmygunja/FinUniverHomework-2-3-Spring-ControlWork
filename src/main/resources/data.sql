INSERT INTO category(name, date_created, date_edited)
VALUES ('category1', '2020-10-10', '2020-10-20'),
       ('category2', '2020-10-10', '2020-10-20'),
       ('category3', '2020-10-10', '2020-10-20');


INSERT INTO user(login, first_name, last_name, patronymic, birth_date, date_created, date_edited)
VALUES ('login1', 'Ivan', 'Ivanov', 'Ivanovich', '2005-05-14', '2020-10-10', '2020-10-20'),
       ('login2', 'Petr', 'Petrov', 'Petrovich', '1999-02-04', '2020-10-10', '2020-10-20');


INSERT INTO work(name, description, date_done, is_done, date_created, date_edited)
VALUES ('work1', 'description1', '1994-12-11', TRUE, '2020-10-10', '2020-10-20'),
       ('work2', 'description2', '1944-03-24', FALSE, '2020-10-10', '2020-10-20');
