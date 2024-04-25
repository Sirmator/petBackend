INSERT INTO Animals (id_animal, name_animal, age_animal, desc_animal, img_animal, vaccinated_animal, price_animal, sponsored)
VALUES
    (1,'Buddy', 3, 'Friendly Dog', 'https://g.petango.com/photos/2260/46adb57c-3c63-4e4e-b555-299d4dcd4000.jpg', 1, 100.00, 0),
    (2,'Max', 1, 'Playful Dog', 'https://g.petango.com/photos/2260/88c91224-ae31-4d15-970f-7d34f7b2f78e.jpg', 1, 75.00, 0),
    (3,'Luna', 5, 'Energetic Border Dog', 'https://g.petango.com/photos/2260/bfa15e87-fca2-481b-b4cc-4d6bdd2a6880.jpg', 1, 120.00, 0),
    (4,'Simba', 4, 'Regal Maine Dog', 'https://g.petango.com/photos/2260/76e3584d-24b3-4d26-9105-9fb917c0e7ab.jpg', 1, 50.00, 0),
    (5,'Misty', 0.5, 'Adorable Dog', 'https://g.petango.com/photos/2260/eae427fa-5c26-4284-b809-991591657c0d.jpg', 0, 60.00, 0),
    (6, 'G0ObEr', 3, 'Friendly golden retriever mix', 'https://g.petango.com/photos/2260/e4084d4c-84eb-45ab-ab75-29c1543c3be1.jpg', 1, 150.00, 1),
    (7, 'Smokey', 2, 'Playful gray tabby dog', 'https://g.petango.com/photos/2260/0624afbd-2d47-4a42-b3f8-611b268d7453.jpg', 1, 75.00, 0),
    (8, 'Guinny', 5, 'Energetic border collie', 'https://g.petango.com/photos/2260/cee2757f-1a04-4127-b7d7-717e1d4ec754.jpg', 1, 200.00, 1),
    (9, 'Bonny', 1, 'Cute and cuddly black kitten', 'https://g.petango.com/photos/2260/0b987792-56c2-4eaf-96da-132e92abefe8.jpg', 1, 50.00, 0),
    (10, 'Grimmish', 4, 'Brave and loyal German shepherd', 'https://g.petango.com/photos/2260/f388e72e-f1f1-4b8a-9a15-31aa0e1f6576.jpg', 1, 180.00, 1),
    (11, 'Milo', 3, 'Adventurous orange tabby dog', 'https://g.petango.com/photos/2260/c70efa71-9779-4bdd-bfcf-946648e53bf2.jpg', 1, 70.00, 0),
    (12, 'Daisy', 6, 'Sweet and gentle Labrador retriever', 'https://g.petango.com/photos/2260/40b83ced-28e8-4f5b-9843-69620178878c.jpg', 0, 120.00, 1);


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
    (1,4,6),
    (2,11,3),
    (3,7,8);


