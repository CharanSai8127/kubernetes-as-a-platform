# Security Inside CI

Security is integrated directly into:
- the CI pipeline.

The goal is:
- reducing deployment risk before artifacts reach production environments.

---

# Layered Security Validation

CI commonly applies:
- multiple security checks during validation.

Examples include:
- static code analysis
- dependency scanning
- filesystem scanning
- and container image scanning.

---

# SonarQube

SonarQube helps identify:
- code smells
- maintainability issues
- security vulnerabilities
- and static-analysis findings.

This improves:
- code quality and operational reliability.

---

# Trivy

Trivy scans:
- filesystems
- dependencies
- and container images

for:
- known vulnerabilities
- misconfigurations
- and exposed risks.

---

# OWASP Dependency Check

OWASP Dependency Check validates:
- third-party dependencies

against:
- known CVEs and vulnerable packages.

---

# Key Insight

Security validation inside CI reduces risk exposure before artifacts are promoted toward production.
