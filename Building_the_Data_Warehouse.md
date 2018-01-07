Book Reading as:
![Building the Data Warehouse 4th Edition](/pics/building_DW_4th.jpeg)

> Thanks William H. Inmon's good book

# Table of Contents

[01 Evolution of Decision Support Systems](#01-evolution-of-decision-support-systems)

[02 The Data Warehouse Environment](#02-the-data-warehouse-environment)

[03 The Data Warehouse and Design](#03-the-data-warehouse-and-design)

[04 Granularity in the Data Warehouse](#04-granularity-in-the-data-warehouse)

[05 The Data Warehouse and Technology](#05-the-data-warehouse-and-technology)

[06 The Distributed Data Warehouse](#06-the-distributed-data-warehouse)

[07 Executive Information Systems and the Data Warehouse](#07-executive-information-systems-and-the-data-warehouse)

[08 External Data and the Data Warehouse](#08-external-data-and-the-data-warehouse)

[09 Migration to the Architected Environment](#09-migration-to-the-architected-environment)

[10 The Data Warehouse and the Web](#10-the-data-warehouse-and-the-web)

[11 Unstructured Data and the Data Warehouse](#11-unstructured-data-and-the-data-warehouse)

[12 The Really Large Data Warehouse](#12-the-really-large-data-warehouse)

[13 The Relational and the Multidimentional Model as a Basis for Database Design](#13-the-relational-and-the-multidimentional-model-as-a-basis-for-database-design)

[14 Data Warehouse Advanced Topics](#14-data-warehouse-advanced-topics)

[15 Cost-Justification and Return on Investment for a Data Warehouse](#15-cost-justification-and-return-on-investment-for-a-data-warehouse)

[16 The Data Warehouse and the ODS](#16-the-data-warehouse-and-the-ods)

[17 Corporate Information Compliance and Data Warehouse](#17-corporate-information-compliance-and-data-warehouse)

[18 The End-User Community](#18-the-end-user-community)

[19 Data Warehouse Design Review Checklist](#19-data-warehouse-design-review-checklist)

[Reference Information](#reference-information)

---

# 01 Evolution of Decision Support Systems

_[back to TOC](#table-of-contents)_

# 02 The Data Warehouse Environment

_[back to TOC](#table-of-contents)_

# 03 The Data Warehouse and Design

_[back to TOC](#table-of-contents)_

* There are 2 major components to building a data warehouse:
  1. the design of the interface from operational systems
  2. the design of the data warehouse itself

* The requirements for the data warehouse CANNOT be known until it is **partially populated and in use**, and design apporaches that have worked in the past will not necessarily suffice in subsequent data warehouse.

* Data warehouses are constructed in a heuristic manner, where one phase of development depends entirely on the results attained in the previous phase:
  1. One portion of data is populated.
  2. It is then used and scrutinized by the DSS analyst.
  3. Based on feedback from the end user, the data is modified and/or other data is added.
  4. Another portion of the data warehouse is built, and so forth.
  The feedback loop continues throughout the entire life of the data warehouse.

## Beginning with Operational Data

### Some typical data problem showing the lack of integration in existing systems environments:

  * Same Data, Different Name
  * Different Data, Same Name
  * Data Found Here, Nowhere Else
  * Different Keys, Same Data

**The existing systems environment holds tons of data, and attempting to scan all of it every time a data warehouse load needs to be done is wasteful and unrealistic.**

### Three types of loads are made into the data warehouse from the operational environment:

  * **Archival data**
    * As a rule, loading archival data from the legacy environment as the data warehouse is first loaded presents a minimal challenge for two reasons.
    1) it often is not done at all. Organizations find the use of old data not cost-effective in many environments.
    2) Even when archival data is loaded, it is a one-time-only event.
  * **Data currently contained in the operational environment**
    * Likewire presents a minimal challenge because it must be done only once.
    * Usually, the existing systems environment can be downloaded to a sequential file, and the sequential file can be downloaded into the warehosue with no disruption to the online environment.
  * **Ongoing changes to the data warehouse environment from the changes (updates) that have occurred in the operational environment since the last refresh**
    * Loading data on an ongoing basis - as changes are made to the operational environment - presents the LARGEST challenge to the data architect.
    * Efficiently trapping those ongoing daily changes and manupulating them is not easy.
    * Scanning existing files, then, is a major issue facing the data warehouse architect.

### Five common techniques are used to limit the amount of operational data scanned at the point of refreshing the data warehouse:

  1. Time stamped
  2. Delta file
    * A _delta file_ contains only the changes made to an application as a result of the transactions that have run through the operational environment.
  3. Log or audit file
    * A _log file_ contains essentially the same data as a _delta file_. However, there're some major differences. (Many times, computer operations protects the log files because they are needed in the recovery process. Computer operations is not particularly thrilled to have its log file used for something other than its primary purpose. Another difficulty with a log tape is that the internal format is built for system purposes, not applications purpose. A technological guru may be needed to interface the contents of data on the log tape. Another shortcomping is that the log file usually contains much more information than that desired by the data warehouse developer.
    * _Autit files_ have many of the same shortcomings as log files.
    * An example of the use of log files to update a data warehouse is the Web logs created by the Web-based eBusiness environment.
  4. Application code
  5. Changes to database since last update (through comparing between before image and after image)

Data must be condensed both at the moment of extraction and as it arrived at the warehouse.

## The Data Warehouse and Data Models

### How the level of modeling relate

1. Operational data model = Corporate data model
2. Performance factors are added prior to database design
3. Remove pure operational data
4. Add element of time to key
5. Add derived data where appropriate
6. Create artifacts of relationships
7. Perform stability analysis

### Three levels of data warehouse data modeling

* High-Level Modeling: entity relationship diagram, or ERD
* Mid-Level Modeling: data item set, or DIS, including four basic constructs
  1) A primary grouping of data
  2) A secondary grouping of data
  3) A connector
  4) "Type of" data
* Low-Level Modeling: physical model



# 04 Granularity in the Data Warehouse

_[back to TOC](#table-of-contents)_

# 05 The Data Warehouse and Technology

_[back to TOC](#table-of-contents)_

# 06 The Distributed Data Warehouse

_[back to TOC](#table-of-contents)_

# 07 Executive Information Systems and the Data Warehouse

_[back to TOC](#table-of-contents)_

# 08 External Data and the Data Warehouse

_[back to TOC](#table-of-contents)_

# 09 Migration to the Architected Environment

_[back to TOC](#table-of-contents)_

# 10 The Data Warehouse and the Web

_[back to TOC](#table-of-contents)_

# 11 Unstructured Data and the Data Warehouse

_[back to TOC](#table-of-contents)_

# 12 The Really Large Data Warehouse

_[back to TOC](#table-of-contents)_

# 13 The Relational and the Multidimentional Model as a Basis for Database Design

_[back to TOC](#table-of-contents)_

# 14 Data Warehouse Advanced Topics

_[back to TOC](#table-of-contents)_

# 15 Cost-Justification and Return on Investment for a Data Warehouse

_[back to TOC](#table-of-contents)_

# 16 The Data Warehouse and the ODS

_[back to TOC](#table-of-contents)_

# 17 Corporate Information Compliance and Data Warehouse

_[back to TOC](#table-of-contents)_

# 18 The End-User Community

_[back to TOC](#table-of-contents)_

# 19 Data Warehouse Design Review Checklist

_[back to TOC](#table-of-contents)_

# Reference Information

_[back to TOC](#table-of-contents)_

