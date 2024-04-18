INSERT INTO Animals (id_animal, name_animal, age_animal, desc_animal, img_animal, vaccinated_animal, price_animal, sponsored)
VALUES
    (1,'Buddy', 3, 'Friendly Dog', 'https://g.petango.com/photos/2260/46adb57c-3c63-4e4e-b555-299d4dcd4000.jpg', 1, 100.00, 0),
    (2,'Max', 2.5, 'Playful Dog', 'https://g.petango.com/photos/2260/88c91224-ae31-4d15-970f-7d34f7b2f78e.jpg', 1, 75.00, 0),
    (3,'Luna', 1.5, 'Energetic Border Dog', 'https://g.petango.com/photos/2260/bfa15e87-fca2-481b-b4cc-4d6bdd2a6880.jpg', 1, 120.00, 0),
    (4,'Simba', 4, 'Regal Maine Dog', 'https://g.petango.com/photos/2260/76e3584d-24b3-4d26-9105-9fb917c0e7ab.jpg', 1, 50.00, 0),
    (5,'Misty', 0.5, 'Adorable Dog', 'https://g.petango.com/photos/2260/eae427fa-5c26-4284-b809-991591657c0d.jpg', 0, 60.00, 0);


INSERT INTO users (id_user, city, email, first_name, last_name, phone, postal_code, roles, user_name)
VALUES
    (1,'Montreal', 'emailbidon1@gmail.com','Bobby', 'Hill', '432,999,6541', 'HD3 H2W', 'User', 'Himator'),
    (2,'Montreal', 'emailbidon1@gmail.com','Carl', 'Baskions', '432,999,6541', 'HD3 H2W', 'User', 'Dingus'),
    (3,'New York', 'emailbidon1@gmail.com','Johnny', 'Sins', '432,999,6541', 'HD3 H2W', 'User', 'TotallyHim'),
    (4,'Sweden', 'emailbidon1@gmail.com','Albino', 'Hill', '432,999,6541', 'HD3 H2W', 'User', 'Vevo'),
    (5,'New York', 'emailbidon1@gmail.com','Sheldon', 'Hill', '432,999,6541', 'HD3 H2W', 'User', 'Cooper'),
    (6,'Sweden', 'emailbidon1@gmail.com','Maggot', 'Hill', '432,999,6541', 'HD3 H2W', 'User', 'Bingoos'),
    (7,'New York', 'emailbidon1@gmail.com','Chad', 'Hill', '432,999,6541', 'HD3 H2W', 'User', 'GigaMan'),
    (8,'Tokyo', 'emailbidon1@gmail.com','Wong', 'Hill', '432,999,6541', 'HD3 H2W', 'User', 'Goober');


INSERT INTO sponsors(id_sponsors, id_animal, id_user)
VALUES
    (1,4,6);