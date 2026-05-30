# NetworkPolicy Overview

NetworkPolicy is the primary Kubernetes mechanism for:
- controlling workload communication.

It defines:
- who can communicate
- with whom
- and under what conditions.

---

# Why NetworkPolicy Matters

Without policies,
pods may communicate freely across:
- namespaces
- applications
- and tenants.

This creates:
- security risk
- and operational exposure.

---

# Common Policy Controls

Examples include:

Allow:
- frontend to backend

Allow:
- backend to database

Deny:
- unrelated communication

---

# Runtime Platform Protection

NetworkPolicies reduce:
- attack surface
- unauthorized access
- and lateral movement.

---

# Platform Engineering Perspective

Network communication should follow:
- least privilege principles.

---

# Key Insight

NetworkPolicies transform networking from open communication to controlled communication.
