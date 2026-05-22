# Orphaned Infrastructure Leakage

Infrastructure resources may continue existing even after:
- ownership mapping is lost.

These become:
- orphaned resources.

---

# Common Examples

Examples include:
- unused EBS volumes
- forgotten load balancers
- unmanaged IAM roles
- dangling networking resources
- and abandoned databases.

---

# Operational Risks

Orphaned infrastructure creates:
- cost leakage
- security exposure
- and operational uncertainty.

---

# Common Causes

Examples include:
- deleted Terraform state
- incomplete cleanup
- manual infrastructure changes
- and broken ownership tracking.

---

# Platform Engineering Perspective

Infrastructure consistency also requires:
- ownership consistency.

---

# Key Insight

Infrastructure without ownership eventually becomes operational risk.
