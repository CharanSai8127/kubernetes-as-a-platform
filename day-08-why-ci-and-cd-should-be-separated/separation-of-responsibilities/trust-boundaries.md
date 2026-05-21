# Trust Boundaries

CI and CD systems operate across:
- different trust boundaries.

This is one of the strongest reasons:
- operational separation matters.

---

# CI Trust Boundary

CI systems frequently:
- execute user-controlled code
- process pull requests
- build dependencies
- and interact with external systems.

This environment should not directly own:
- production deployment permissions.

---

# CD Trust Boundary

CD systems interact directly with:
- production infrastructure
- deployment state
- and runtime environments.

This requires:
- stricter operational control
- and deployment governance.

---

# Security Importance

Collapsing both trust boundaries increases:
- operational risk
- credential exposure
- and cluster compromise impact.

---

# Least Privilege Principle

Every operational layer should only receive:
- the minimum required permissions.

This reduces:
- blast radius during compromise.

---

# Key Insight

Deployment systems should not inherit unrestricted permissions from artifact-validation systems.
