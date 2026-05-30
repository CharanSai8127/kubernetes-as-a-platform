# Why Namespaces Are Not Security Boundaries

A namespace separates:
- resource visibility
- naming
- and administration.

It does not automatically provide:
- network isolation
- access isolation
- or resource isolation.

---

# Networking Example

Without NetworkPolicies:

frontend namespace

may communicate with:

backend namespace

using cluster networking.

---

# Access Example

Without RBAC,
users may still perform operations across:
- multiple namespaces.

---

# Resource Example

Without quotas,
one namespace may consume:
- excessive CPU
- memory
- and storage.

This impacts:
- other workloads in the cluster.

---

# Platform Engineering Perspective

Namespaces alone cannot provide:
- tenant isolation.

---

# Key Insight

A namespace is an organizational boundary rather than a security boundary.
