-- Создаем базу, если не существует
SELECT 'CREATE DATABASE dock_1'
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'dock_1')\gexec

-- Подключаемся к созданной базе
\c dock_1

-- Дополнительные SQL-команды при необходимости
-- CREATE TABLE IF NOT EXISTS ...