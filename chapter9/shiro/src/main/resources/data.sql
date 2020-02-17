insert into users (user_id, username, password, enabled) values (1, '张三', '$2a$10$/ns.CwZ9sdhQaVjw/bwBQeelnmTZTI19trLtyY/bjbIVUokAckX8y', true);
insert into users (user_id, username, password, enabled) values (2, '李四', '$2a$10$WPDbKLCRnV0UrkEs2IEtUejsZiicxt0/GhUcOkg2.UscjBi8tOmxa', true);

insert into roles (role_id, role_name) values (1, 'admin');
insert into roles (role_id, role_name) values (2, 'author');

insert into permissions (permission_id, permission_name) values (1, 'todo:read');
insert into permissions (permission_id, permission_name) values (2, 'todo:edit');
insert into permissions (permission_id, permission_name) values (3, 'todo:delete');

insert into user_roles(user_id, role_id) values(1, 1);
insert into user_roles(user_id, role_id) values(1, 2);
insert into user_roles(user_id, role_id) values(2,2);

insert into role_permissions(role_id, permission_id) values(1, 1);
insert into role_permissions(role_id, permission_id) values(1, 2);
insert into role_permissions(role_id, permission_id) values(1,3);
insert into role_permissions(role_id, permission_id) values(2, 1);