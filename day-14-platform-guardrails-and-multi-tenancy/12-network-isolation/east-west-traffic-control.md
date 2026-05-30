# East West Traffic Control

East-west traffic refers to:
- communication between workloads inside the cluster.

This traffic forms the majority of:
- distributed-system communication.

---

# Why East West Traffic Matters

Compromised workloads commonly attempt:
- lateral movement
- service discovery
- and unauthorized communication.

Unrestricted east-west traffic increases:
- security exposure.

---

# Common Communication Paths

Examples include:

Frontend
↓

Backend

Backend
↓

Database

Application
↓

Platform Services

---

# Runtime Platform Protection

Traffic controls restrict:
- unnecessary communication
- and tenant crossover.

---

# Platform Engineering Perspective

Internal communication should be governed just as strictly as external communication.

---

# Key Insight

Most platform attacks move sideways before they move outward.
