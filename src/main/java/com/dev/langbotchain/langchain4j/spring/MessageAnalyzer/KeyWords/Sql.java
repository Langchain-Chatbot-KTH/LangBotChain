package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords;

import java.util.List;

public class Sql {
    public static final List<String> SQL_SENTENCES = List.of(
            "What is a SQL injection attack?",
            "How do I create a new database in SQL?",
            "Can you explain the difference between SQL and NoSQL databases?",
            "What are the basic SQL commands?",
            "How do I retrieve data from a SQL database?",
            "What is normalization in SQL?",
            "How can I update records in a SQL database?",
            "What is the difference between a SQL join and a subquery?",
            "How do I delete records from a SQL table?",
            "What are SQL indexes and how do they improve performance?",
            "How do I create a new table in a SQL database?",
            "What is a stored procedure in SQL?",
            "How can I perform transactions in SQL?",
            "What is the difference between SQL Server and MySQL?",
            "How do I grant privileges to users in SQL?",
            "What is a primary key in SQL?",
            "How do I insert data into a SQL table?",
            "What are the benefits of using SQL views?",
            "How do I perform backup and restore operations in SQL?",
            "What is a trigger in SQL and how do I use it?",
            "How can I optimize SQL queries for better performance?",
            "What is the purpose of the GROUP BY clause in SQL?",
            "How do I handle NULL values in SQL?",
            "What is the difference between INNER JOIN and OUTER JOIN in SQL?",
            "How do I perform data encryption in SQL?",
            "What is a foreign key constraint in SQL?",
            "How do I use the CASE statement in SQL?",
            "What are SQL aggregates and how do I use them?",
            "How do I create and use indexes in SQL?",
            "What is the purpose of the HAVING clause in SQL?",
            "How can I handle duplicate records in SQL?",
            "What is the significance of the COMMIT and ROLLBACK statements in SQL?",
            "How do I use the UNION operator in SQL?",
            "What is the difference between TRUNCATE and DELETE in SQL?",
            "How do I use the TOP clause in SQL?",
            "What is SQL injection and how can I prevent it?",
            "How do I retrieve data from multiple tables in SQL?",
            "What are the advantages of using stored procedures in SQL?",
            "How do I perform data manipulation operations in SQL?",
            "What is the purpose of the LIKE operator in SQL?",
            "How do I alter a table in SQL?",
            "What is the difference between CHAR and VARCHAR data types in SQL?",
            "How do I use the LIMIT clause in SQL?",
            "What is the role of the ORDER BY clause in SQL?",
            "How can I optimize SQL queries for large datasets?",
            "What is the difference between a temporary table and a table variable in SQL?",
            "How do I use the EXISTS operator in SQL?",
            "What is the purpose of the CHECK constraint in SQL?",
            "How do I use the BETWEEN operator in SQL?",
            "What are the benefits of using SQL transactions?",
            "How do I perform string concatenation in SQL?",
            "What is the difference between a clustered and a non-clustered index in SQL?",
            "How do I retrieve the last inserted ID in SQL?",
            "What is the role of the COUNT function in SQL?",
            "How do I use the COALESCE function in SQL?",
            "What are SQL triggers and how do I create them?",
            "How do I use the CASE statement in SQL to handle multiple conditions?",
            "What is the purpose of the ROW_NUMBER() function in SQL?",
            "How do I perform full-text search in SQL?",
            "What is the difference between SQL and PL/SQL?",
            "How do I use the RANK() function in SQL?",
            "What is the significance of the MERGE statement in SQL?",
            "How do I use the WINDOW functions in SQL?",
            "What is the purpose of the CROSS APPLY and OUTER APPLY operators in SQL?",
            "How do I pivot rows into columns in SQL?",
            "What is the difference between a subquery and a correlated subquery in SQL?",
            "How do I use the XML data type in SQL?",
            "What is the role of the UNION ALL operator in SQL?",
            "How do I use the COALESCE function in SQL to handle NULL values?",
            "What is the significance of the PARTITION BY clause in SQL?",
            "How do I perform a case-insensitive search in SQL?",
            "What are common SQL optimization techniques?",
            "How do I use the STRING_AGG function in SQL?",
            "What is the purpose of the FETCH clause in SQL?",
            "How do I use the STRING_SPLIT function in SQL?",
            "What is the significance of the APPLY operator in SQL?",
            "How do I use the CONCAT function in SQL?",
            "What is the purpose of the LEAD and LAG functions in SQL?",
            "How do I use the PIVOT and UNPIVOT operators in SQL?",
            "What are the advantages of using table variables in SQL?",
            "How do I use the TRY...CATCH block in SQL for error handling?",
            "What is the difference between the MERGE and UPDATE statements in SQL?",
            "How do I perform a fuzzy search in SQL?",
            "What is the significance of the OFFSET FETCH clause in SQL?",
            "How do I use the STRING_ESCAPE function in SQL?",
            "What is the purpose of the SESSION_CONTEXT function in SQL?",
            "How do I use the STRING_AGG function in SQL?",
            "What is the significance of the CONCAT_WS function in SQL?",
            "How do I use the TRANSLATE function in SQL?",
            "What are the benefits of using SQL Server Management Studio (SSMS)?",
            "How do I use the FORMAT function in SQL?",
            "What is the purpose of the CONCAT_WS function in SQL?",
            "How do I use the STRING_ESCAPE function in SQL?",
            "What is the significance of the TRANSLATE function in SQL?",
            "How do I use the FORMAT function in SQL?",
            "What is the purpose of the TRANSLATE function in SQL?"
    );


    public static final List<String> SQL_KEYWORDS = List.of(
            "SQL",
            "query",
            "database",
            "table",
            "record",
            "index",
            "join",
            "subquery",
            "constraint",
            "transaction",
            "view",
            "trigger",
            "procedure",
            "function",
            "clustered",
            "non-clustered",
            "command",
            "syntax",
            "statement",
            "clause",
            "expression",
            "data type",
            "foreign key",
            "primary key",
            "column",
            "row",
            "backup",
            "restore",
            "permission",
            "execution plan",
            "data manipulation",
            "DDL",
            "DML",
            "DCL",
            "TCL",
            "ACID properties",
            "aggregate function",
            "alias",
            "case sensitivity",
            "collation",
            "cursor",
            "database schema",
            "deadlock",
            "denormalization",
            "entity-relationship model",
            "full-text search",
            "group by",
            "having",
            "inner join",
            "outer join",
            "left join",
            "right join",
            "self join",
            "natural join",
            "cross join",
            "implicit join",
            "explicit join",
            "like operator",
            "in operator",
            "not in operator",
            "exists operator",
            "not exists operator",
            "is null operator",
            "is not null operator",
            "order by",
            "transaction isolation levels",
            "normalization",
            "OLAP",
            "OLTP",
            "query optimization",
            "query execution plan",
            "nested query",
            "partitioning",
            "referential integrity",
            "row locking",
            "row versioning",
            "savepoint",
            "SQL injection",
            "stored procedure",
            "triggers",
            "user-defined functions",
            "user-defined data types",
            "user-defined aggregates",
            "view",
            "WITH clause",
            "window function",
            "XQuery",
            "XPATH",
            "XML data type",
            "temporary table",
            "table variable",
            "table expression",
            "recursive common table expression",
            "temporary stored procedure",
            "temporary table",
            "transaction log",
            "transaction management",
            "tablespace",
            "query hint",
            "materialized view",
            "merge statement",
            "database link",
            "distributed database",
            "commit",
            "rollback",
            "transaction log",
            "transaction management",
            "user-defined function",
            "user-defined data type",
            "user-defined aggregate",
            "view",
            "WITH clause",
            "window function",
            "XQuery",
            "XPATH",
            "XML data type",
            "temporary table",
            "table variable",
            "table expression",
            "recursive common table expression",
            "temporary stored procedure",
            "temporary table",
            "transaction log",
            "transaction management",
            "tablespace",
            "query hint",
            "materialized view",
            "merge statement",
            "database link",
            "distributed database",
            "commit",
            "rollback",
            "transaction log",
            "transaction management",
            "database user",
            "database role",
            "database permission",
            "database schema",
            "database object",
            "system database",
            "user database",
            "tempdb",
            "master",
            "model",
            "msdb",
            "dbo",
            "sys",
            "information schema",
            "primary key constraint",
            "foreign key constraint",
            "check constraint",
            "unique constraint",
            "default constraint",
            "index",
            "clustered index",
            "non-clustered index",
            "composite index",
            "index seek",
            "index scan",
            "index hint",
            "index rebuild",
            "index fragmentation",
            "partitioned index",
            "indexed view",
            "filter index",
            "covering index",
            "optimizer",
            "cost-based optimizer",
            "rule-based optimizer",
            "query optimizer",
            "optimizer hint",
            "optimizer timeout",
            "optimizer plan cache",
            "execution plan",
            "estimated execution plan",
            "actual execution plan",
            "query plan",
            "query execution plan",
            "plan guide",
            "plan cache",
            "plan handle",
            "plan freezing",
            "plan regression",
            "plan forcing",
            "plan parameterization",
            "plan reuse",
            "plan stability",
            "plan affecting",
            "plan hint",
            "plan management",
            "plan comparison",
            "plan cache bloat",
            "plan recompilation",
            "plan caching",
            "query expansion",
            "query federation",
            "query generation",
            "query handling",
            "query interpretation",
            "query joining",
            "query knowledge",
            "query loading",
            "query mapping",
            "query normalization",
            "query optimization",
            "query parsing",
            "query queuing",
            "query routing",
            "query scheduling",
            "query transformation",
            "query understanding",
            "query validation",
            "query workflow",
            "query XML",
            "query yielding",
            "query zone",
            "queryability",
            "querying",
            "queryology",
            "quotation",
            "quote",
            "quoted identifier",
            "quoted string",
            "quoted text",
            "row",
            "row compression",
            "row constructor",
            "row count",
            "row data",
            "row deletion",
            "row identifier",
            "row level",
            "row level locking",
            "row lock",
            "row lock contention",
            "row locking",
            "row major order",
            "row migration",
            "row mode",
            "row order",
            "row orientation",
            "row partition",
            "row pointer",
            "row retrieval",
            "row search",
            "row security",
            "row selection",
            "row size",
            "row source",
            "row store",
            "row versioning",
            "row-level security",
            "row-level trigger",
            "rownumber"
            );
        }