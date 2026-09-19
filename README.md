# Lab 01: Worker Salary Management System

A Java application designed to manage employee data and calculate payroll totals efficiently.

## Problem Description
The goal of this application is to store and manage information for a list of workers (supporting up to 100 entries). Each worker entry tracks:
* **Name** (`String`)
* **Base Salary** (`double`)
* **Salary Complement** (`double`)

The program calculates the total salary for each individual worker as well as the global payroll total across all registered employees.

---

## Implementation Details

### Project Structure
* **`Worker.java`**: Represents the worker entity with private fields, constructor, getters, and encapsulation logic for salary calculation.
* **`Main.java`**: Contains the `main` method to instantiate worker objects, process the list, and format the output.

---

## Additional Questions & Design Answers

### 1. Is your design ready to easily accept changes in how to calculate the total salary (e.g., taking taxes into account)?
> **Yes.** Salary calculation logic is fully encapsulated inside the `getTotalSalary()` method within the `Worker` class. If calculation rules change (such as applying a tax deduction), we only need to update the formula inside `getTotalSalary()`. No changes to `Main.java` or external display logic are required.

### 2. How to implement the case where I don't use all 100 "spaces" for workers (e.g., the company only has 20)?
> **Two Approaches:**
> 1. **Fixed Array + Counter (Implemented):** We allocate a fixed array `Worker[100]` and maintain an integer counter (`count`). We iterate only from index `0` to `count - 1`, safely ignoring unallocated `null` slots.
> 2. **Dynamic List (Alternative):** Use Java's `ArrayList<Worker>` instead of a fixed array. An `ArrayList` dynamically resizes as workers are added, eliminating wasted array space entirely.

