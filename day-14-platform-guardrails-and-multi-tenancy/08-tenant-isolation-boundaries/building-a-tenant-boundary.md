# Building A Tenant Boundary

No single Kubernetes feature creates:
- complete tenant isolation.

Tenant boundaries emerge through:
- multiple layers of controls working together.

---

# Tenant Boundary Formula

Namespace
+
RBAC
+
NetworkPolicy
+
ResourceQuota
+
Policy Enforcement

=

Tenant Boundary

---

# Why Multiple Layers Matter

Each layer protects:
- a different aspect of the platform.

Examples include:

Namespaces:
- organization

RBAC:
- access control

NetworkPolicies:
- communication control

Quotas:
- resource governance

Policies:
- workload governance

---

# Runtime Platform Protection

Layered controls reduce:
- security risk
- operational risk
- and blast radius.

---

# Platform Engineering Perspective

Isolation is achieved through defense in depth.

---

# Key Insight

Tenant boundaries are created through multiple governance controls working together.
