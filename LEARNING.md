# 🧠 Learning Notes - Job Portal Project

Date: 2025-07-21

---

## 1. Java Constructor Error & Lombok Usage

- Error:  

- Cause: No matching constructor present; only no-arg constructor was defined.
- Fix: Added `@NoArgsConstructor` alongside `@AllArgsConstructor` in Lombok to generate both constructors.
- Importance: Frameworks like Spring and Jackson require no-arg constructors for object instantiation.

---

## 2. Changing Project Java Version to 17

- IntelliJ: Set Project SDK and Language level to 17 via Project Structure.
- Maven: Update `maven-compiler-plugin` with `<source>17</source>` and `<target>17</target>`.
- Gradle: Set `sourceCompatibility` and `targetCompatibility` to JavaVersion.VERSION_17.
- Ensure system `JAVA_HOME` points to Java 17.

---

## 3. Git & GitHub Workflow

- Initialize git and enable VCS integration in IntelliJ.
- Create feature branches using `git checkout -b feature/name`.
- Push branches to GitHub using `git push -u origin feature/name`.
- Handle mismatch between local branch (`master`) and GitHub default branch (`main`) by renaming local branch and setting upstream.
- Use commands like:
- `git branch -m master main`
- `git branch --set-upstream-to=origin/main main`
- `git pull origin main`
- Check remote branches with `git branch -r`.

---

## 4. Notes Sharing Strategy on GitHub

- Created `LEARNING.md` in project root to document learnings.
- Link `LEARNING.md` in `README.md` for visibility.
- Optionally, use GitHub Wiki or dedicated `notes/` folder.

---

# Next Steps

- Continue development on feature branches.
- Regularly update `LEARNING.md`.
- Explore GitHub Actions for CI/CD automation.

---

## 🗓️ Date: July 22, 2025

---

## ✅ Major Takeaways from Today’s Work

### 1. Separation of Frontend and Backend

- **Problem:** Previously, data was communicated via `.jsp` files (HTML-based), which tightly coupled the frontend and backend.
- **Solution:** Implemented **RESTful APIs** in Spring Boot to serve data in **JSON format**, making the backend reusable and frontend-independent.

---

### 2. API Testing with Postman

- Learned to use **Postman** for testing backend endpoints.
- Verified `GET`, `POST`, `PUT`, and `DELETE` operations using JSON payloads.

---

### 3. Cross-Origin Communication

- Applied `@CrossOrigin` annotation in Spring Boot controllers.
- Enabled frontend (React) to access backend APIs without CORS issues.

---

### 4. React for Frontend

- Started using **React** as the frontend framework.
- Connected React UI to Spring Boot backend using REST APIs.

---

## 💡 Summary

Today focused on modernizing the architecture:
- Shifted from JSP-based views to React + REST APIs.
- Improved frontend-backend separation.
- Gained hands-on experience with Postman and cross-origin configuration.

*End of notes.*

