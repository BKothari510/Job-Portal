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

*End of notes.*

