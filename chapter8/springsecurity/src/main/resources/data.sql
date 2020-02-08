insert into users (username, password, enabled) values ('张三', '$2a$10$/ns.CwZ9sdhQaVjw/bwBQeelnmTZTI19trLtyY/bjbIVUokAckX8y', true);
insert into authorities (username, authority) values ('张三', 'ROLE_USER');

insert into users (username, password, enabled) values ('李四', '$2a$10$WPDbKLCRnV0UrkEs2IEtUejsZiicxt0/GhUcOkg2.UscjBi8tOmxa', true);
insert into authorities (username, authority) values ('李四', 'ROLE_ADMIN');