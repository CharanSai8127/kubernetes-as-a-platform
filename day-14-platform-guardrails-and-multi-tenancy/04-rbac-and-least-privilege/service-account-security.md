# Service Account Security

Workloads commonly interact with:
- Kubernetes APIs
- platform services
- and external systems.

These identities are represented through:
- service accounts.

---

# Why Service Account Security Matters

Applications should not receive:
- unrestricted platform access.

Service accounts should only access:
- required resources.

---

# Runtime Security Risks

Overprivileged service accounts may allow:
- secret exposure
- privilege escalation
- and cluster compromise.

---

# Security Best Practices

Service accounts should:
- have minimal permissions
- be workload specific
- and follow least privilege.

---

# Platform Engineering Perspective

Applications require identities just like users.

---

# Key Insight

Workload identities should be governed with the same rigor as user identities.
