# User Namespaces And Runtime Isolation

User namespaces improve:
- container-to-host isolation.

They map container identities differently from:
- host operating system identities.

---

# Why User Namespaces Matter

Historically:

Container Root

and

Host Root

were closely aligned.

This increased:
- container escape impact.

---

# Runtime Isolation Benefits

User namespaces reduce:
- host exposure
- privilege escalation impact
- and runtime security risk.

---

# What User Namespaces Do Not Replace

User namespaces do not replace:
- RBAC
- NetworkPolicies
- ResourceQuotas
- admission policies
- or governance controls.

They solve:
- runtime isolation

not:

- platform governance.

---

# Platform Engineering Perspective

User namespaces strengthen workload isolation within shared platforms.

---

# Key Insight

Runtime isolation and platform governance solve different security problems.
