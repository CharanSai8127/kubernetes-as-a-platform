# Security Blast Radius

Security blast radius measures:
- how far a security incident can spread.

A compromised workload should not compromise:
- the entire cluster.

---

# Why Security Blast Radius Matters

Security incidents commonly involve:
- compromised containers
- leaked credentials
- excessive permissions
- and unauthorized access.

Without isolation,
one compromise may affect:
- multiple workloads
- multiple tenants
- and platform services.

---

# Common Protection Controls

Examples include:
- RBAC
- NetworkPolicies
- service account restrictions
- Pod Security Admission
- and workload isolation.

---

# Runtime Platform Benefits

Security controls reduce:
- lateral movement
- privilege escalation
- and platform compromise.

---

# Platform Engineering Perspective

Compromised workloads should encounter multiple security boundaries.

---

# Key Insight

A successful attack should not become a successful platform takeover.
