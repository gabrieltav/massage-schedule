INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem sueca', 'A massagem sueca é um tipo de massagem de corpo inteiro que é ideal para pessoas que são iniciantes, têm muita tensão e são sensíveis ao toque. Ela ajuda desfazer os nós musculares e é uma boa escolha para relaxar completamente.', 170.00, 'https://www.institutounidade.com.br/wp-content/uploads/2018/08/massagem-sueca.jpg');

INSERT INTO tb_scheduling (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-03-13T20:50:07.12345Z');

INSERT INTO tb_scheduling_massage (scheduling_id, massage_id) VALUES (1, 1);