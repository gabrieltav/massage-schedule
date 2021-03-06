INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Marcos', 'Vinicius', 'marcos@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Carlos', 'Eduardo', 'carlos@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem sueca', 'A massagem sueca é um tipo de massagem de corpo inteiro que é ideal para pessoas que são iniciantes, têm muita tensão e são sensíveis ao toque. Ela ajuda desfazer os nós musculares e é uma boa escolha para relaxar completamente.', 170.00, 'https://www.institutounidade.com.br/wp-content/uploads/2018/08/massagem-sueca.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem de aromaterapia', 'A massagem de aromaterapia é um tipo de massagem indicado para pessoas que buscam se curar emocionalmente. Esse tipo de massagem melhora o humor; reduz o estresse e a ansiedade; alivia a tensão muscular e a dor; e reduz os sintomas da depressão.', 150.00, 'https://images.ecycle.com.br/wp-content/uploads/2021/06/16152258/tipos-de-massagem.4.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem com pedras quentes', 'A massagem com pedras quentes é indicada para pessoas que têm dores musculares e tensão, ou que simplesmente querem relaxar.', 160.00, 'https://images.ecycle.com.br/wp-content/uploads/2021/06/16152102/tipos-de-massagem.3.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem profunda', 'A Massagem profunda é uma boa opção para quem tem problemas musculares crônicos, como dor ou lesão. Pode ajudar a aliviar os músculos tensos, a dor muscular crônica e a ansiedade.', 200.00, 'https://www.beautymarket.es/estetica/fotos/23382_notbme3grande.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem esportiva', 'A massagem esportiva é uma boa opção para quem possui lesão causada por movimento repetitivo, como pode acontecer quando há prática de algum esporte. Também é importante para prevenir lesões esportivas, aumentar a flexibilidade e o desempenho físico.', 140.00, 'https://images.ecycle.com.br/wp-content/uploads/2021/06/16152434/tipos-de-massagem.45.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem de ponto-gatilho', 'A massagem de ponto-gatilho é mais adequada para pessoas que têm lesões, dores crônicas ou condições específicas.', 180.00, 'https://images.ecycle.com.br/wp-content/uploads/2021/06/16152538/tipos-de-massagem.65.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Reflexologia', 'A reflexologia é indicada para quem está procurando relaxar ou restaurar seus níveis naturais de energia. Também é uma boa opção para quem não se sente à vontade em ser tocado no corpo inteiro.', 210.00, 'https://images.ecycle.com.br/wp-content/uploads/2021/06/16152651/tipos-de-massagem.333.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem shiatsu', 'A massagem shiatsu é um tipo de massagem japonesa indicada para pessoas que querem se sentir relaxadas e aliviar o estresse, a dor e a tensão.', 170.00, 'https://images.ecycle.com.br/wp-content/uploads/2021/06/16152730/tipos-de-massagem.766.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem tailandesa', 'A massagem tailandesa aumenta a flexibilidade, a circulação e os níveis de energia. Essa massagem é feita no corpo inteiro usando uma sequência de movimentos que são semelhantes aos alongamentos feitos na ioga.', 190.00, 'https://www.essemundoenosso.com.br/wp-content/uploads/2017/05/massagem-tailandesa-3-740x493.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem pré-natal', 'A massagem pré-natal pode ser uma maneira segura das gestantes reduzirem as dores, o estresse e a tensão muscular durante a gravidez.', 150.00, 'https://cdn.shopify.com/s/files/1/0053/0821/9485/products/pre_natal_720x@2x.png?v=1607545352');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem em cadeira', 'A massagem realizada em uma cadeira é indicada para quem deseja uma massagem rápida concentrada no pescoço, nos ombros e nas costas.', 80.00, 'https://dicasdemassagem.com/wp-content/uploads/indicacoes-e-contraindicacoes-da-quick-massage.jpg');
INSERT INTO tb_massage (title, description, price, img_url) VALUES ('Massagem tântrica', 'A massagem tântrica é um tipo de massagem erótica que também envolve uma ligação espiritual muito forte e presente.', 160.00, 'https://www.vittude.com/blog/wp-content/uploads/massagem-tantrica-1200x900.jpg');


INSERT INTO tb_scheduling (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-03-14T09:00:00.12345Z');
INSERT INTO tb_scheduling (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-03-14T10:0:00.12345Z');
INSERT INTO tb_scheduling (date) VALUES (TIMESTAMP WITH TIME ZONE '2021-03-14T20:50:07.12345Z');

INSERT INTO tb_scheduling_massage (scheduling_id, massage_id) VALUES (1, 1);
INSERT INTO tb_scheduling_massage (scheduling_id, massage_id) VALUES (1, 2);
INSERT INTO tb_scheduling_massage (scheduling_id, massage_id) VALUES (2, 3);
INSERT INTO tb_scheduling_massage (scheduling_id, massage_id) VALUES (3, 4);