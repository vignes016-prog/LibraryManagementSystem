<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=0:4facfe,100:00f2fe&height=250&section=header&text=📚Library%20%20ManagementSystem&fontSize=50&fontColor=ffffff&animation=fadeIn&fontAlignY=35"/>

A **Java** backend application built using **Hibernate ORM** and **PostgreSQL** to perform **CRUD (Create, Read, Update, Delete)** operations for managing library records such as books, members, and issued books.

![Java](https://img.shields.io/badge/Java-17-orange)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blue)
![Maven](https://img.shields.io/badge/Build-Maven-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## 📌 Description

Library Management System is a backend project that simulates core library operations — adding new books, viewing available books, updating book/member details, deleting records, and tracking issued/returned books. Built using **Hibernate** for ORM mapping and **PostgreSQL** as the database.

## 🔑 Features

- ➕ Add new book/member records
- 📄 View all books / search book by ID
- ✏️ Update book or member details
- ❌ Delete a book/member record
- 📖 Track issued and returned books

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Core language |
| Hibernate | ORM framework for DB operations |
| PostgreSQL | Database |
| Maven | Dependency management |

## ⚙️ hibernate.cfg.xml (sample)

```xml
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/libraryManagementSystem</property>
        <property name="hibernate.connection.username">postgres</property>
        <property name="hibernate.connection.password">vignesh</property>
        <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
    </session-factory>
</hibernate-configuration>
```

## 📋 Operations Covered

| Operation | Description |
|-----------|--------------|
| Add Book | Insert new book record into database |
| View Book(s) | Fetch single or all book records |
|Update Book | Modify existing book details |
| Delete Book | Remove book record from database |

## ▶️ How to Run

1. Clone the repository
2. Open the project in Eclipse IDE
3. Configure `hibernate.cfg.xml` with your PostgreSQL credentials
4. Run the `Main` class

## 👤 Author

**Vignesh** - [GitHub](https://github.com/vignes016-prog)



